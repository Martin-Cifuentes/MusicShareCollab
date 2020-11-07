package model;
public class Song{
	private String title;
	private String artist;
	private int duration;
	private String relaseDate;
	private Genre aGenre;
	//constructor
	/** 
     * this constructor method creates a song objet
     * @param n String, the name of the song
     * @param a String, the artist of the song
     * @param d int, the duration of the song
     * @param rd String, the relase date of the song
     * @param g Genre, the genre of the song
     */
	public Song(String t, String a, int d, String rd, Genre g){
		this.title = t;
		this.artist = a;
		this.duration = d;
		this.relaseDate = rd;
		this.aGenre = g;
	}
	/** 
     * this method swous the information of the song
     * <b>pre:</b> it must have been called by a method on msc
     * <b>post:</b> the song information
     * @return String, the song information
     */
	//toString
	public String toString(){
		return "*************  Song **************\n" + "**  Title: " + title + "\n**  Artist: " +
				 artist + "\n**  Duration:" + duration/3600 + ":" + (duration%3600)/60 + ":" + ((duration%3600)/60)%60
				  + "\n**  Genre: " + relaseDate;
	}
	//gets
	public String getTitle(){
		return this.title;
	}
	public String getArtist(){
		return this.artist;
	}
	public int getDuration(){
		return this.duration;
	}
	public String getRelaseDate(){
		return this.relaseDate;
	}
	public Genre getGenre(){
		return this.aGenre;
	}
	//sets
	public void setTitle(String t){
		this.title = t;
	}
	public void setArtist(String a){
		this.artist = a;
	}
	public void setDuration(int d){
		this.duration = d;
	}
	public void setRelaseDate(String rd){
		this.relaseDate = rd;
	}
	public void setGenre(Genre g){
		this.aGenre = g;
	}
}