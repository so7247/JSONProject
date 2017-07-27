package com.tacademy.parser;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.tacademy.vo.Artist;
import com.tacademy.vo.Melon;
import com.tacademy.vo.Song;

public class MelonParser {

	public Melon doMelonParser(String jsonStr){
		Melon melon = new Melon();
		
		JSONObject obj = null;
		try{
			
			obj = new JSONObject(jsonStr);
			JSONObject melonObj = obj.getJSONObject("melon");
			
			
			melon.setManuid(melonObj.getInt("menuId"));
			melon.setCount(melonObj.getInt("count"));
			melon.setPage(melonObj.getInt("page"));
			melon.setTotalPages(melonObj.getInt("totalPages"));
			melon.setRankDay(melonObj.getString("rankDay"));
			melon.setRankHour(melonObj.getString("rankHour"));
			
			JSONObject songs = melonObj.getJSONObject("songs");
			JSONArray songArr = songs.getJSONArray("song");
			ArrayList<Song> songList = new ArrayList<Song>();
			for(int i = 0; i < songArr.length(); i++){
				JSONObject song = songArr.getJSONObject(i);
				Song songInfo = new Song();
				songInfo.setSongId(song.getInt("songId"));
				songInfo.setSongName(song.getString("songName"));
				JSONObject artists = song.getJSONObject("artists");
				JSONArray artistArr = artists.getJSONArray("artist");
				
				ArrayList<Artist> artistList = new ArrayList<Artist>();
				for(int j = 0; j < artistArr.length(); j++){
					JSONObject artist = artistArr.getJSONObject(j);
					Artist artistInfo = new Artist();
					artistInfo.setArtistId(artist.getInt("artistId"));
					artistInfo.setArtistName(artist.getString("artistName"));
					
					
					artistList.add(artistInfo);
				}			
				songInfo.setArtist(artistList);
				
				songInfo.setAlbumId(song.getInt("albumId"));
				songInfo.setAlbumName(song.getString("albumName"));
				songInfo.setCurretRank(song.getInt("currentRank"));
				songInfo.setPastRank(song.getInt("pastRank"));
				songInfo.setPlayTime(song.getInt("playTime"));
				songInfo.setIssueDate(song.getString("issueDate"));
				songInfo.setTitleSong(song.getBoolean("isTitleSong"));
				songInfo.setHitSong(song.getBoolean("isHitSong"));
				songInfo.setAdult(song.getBoolean("isAdult"));
				songInfo.setFree(song.getBoolean("isFree"));
				
				
				
				songList.add(songInfo);
			}
			
			melon.setSong(songList);
			
		}catch(JSONException e){
			e.printStackTrace();
		}
		
		return melon;
	}

}
