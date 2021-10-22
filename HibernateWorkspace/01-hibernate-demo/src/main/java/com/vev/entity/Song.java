package com.vev.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song implements Serializable{					
	private static final long serialVersionUID = 1L;

	@Id
	private int songid;
	
	@Column(name = "songname")
	private String name;
	
	@Column(name = "singername")
	private String artist;
	
	public int getSongid() {
		return songid;
	}
	public void setSongid(int songid) {
		this.songid = songid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	@Override
	public String toString() {
		return String.format("Song [songid=%s, name=%s, artist=%s]", songid, name, artist);
	}
}
