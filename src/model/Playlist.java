package model;
public abstract class Playlist{
	public String name;
	public int duration;
	public Genre[] genres;
	public Song[] songs;
	/** 
     * this constructor method creates a song objet
     * @param n String, name of the playlist
     */
	public Playlist(String n){
		this.name = n;
		this.duration = 0;
		this.genres = new Genre[7];
		this.songs = new Song[30];
	}	
	/** 
     * this method adds a song to a playlist
     * <b>pre:</b> it must have been called by a method on msc
     * <b>post:</b> the song has been added
     * @param s Song, the song that is gonna be added
     */
	public abstract void addPlaylistSong(Song s);
	/** 
     * this method adds a song to a playlist
     * <b>pre:</b> it must have been called by a method on msc
     * <b>post:</b> the song has been added
     * @param n String, the name of the user that is adding the song
     * @param s Song, the song that is gonna be added
     */
	public abstract void addPlaylistSong(String n, Song s);

	/** 
     * this method swous the information of the playlist
     * <b>pre:</b> it must have been called by a method on msc
     * <b>post:</b>the playlist information
     * @return String, the playlist information
     */
	//toString
	public abstract String toString();
	//gets
	public String getName(){
		return this.name;
	}
	public int getDuration(){
		return this.duration;
	}
	public String getGenres(){
		String s = "";
		for(int i = 0; i < 5; i++){
			if(genres[i] != null){
				s += " " + genres[i];
			}
		}
		return s;
	}
	//sets
	public void setName(String n){
		this.name = n;
	}
	public void setDuration(int d){
		this.duration = d;
	}
}