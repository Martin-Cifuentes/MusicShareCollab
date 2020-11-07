package model;
public class PublicPlaylist extends Playlist{
	public double score;
	public int cantSongs;
	/** 
     * this constructor calls the super method from playlist to create a public playlist
     * <b>pre:</b> it needs a name
     * <b>post:</b> the Public playlist is crated 
     * @param name String, name of the playlist
     */
	public PublicPlaylist(String name){
		super(name);
		this.score = 0;
		this.cantSongs = 0;
	}
	/** 
     * this method adds a song to a playlist
     * <b>pre:</b> it must have been called by a method on msc
     * <b>post:</b> the song has been added
     * @param s Song, the song that is gonna be added
     */
	public void addPlaylistSong(String n, Song s){
		return;
	}
	/** 
     * this method adds a song to a playlist
     * <b>pre:</b> it must have been called by a method on msc
     * <b>post:</b> the song has been added
     * @param n String, the name of the user that is adding the song
     * @param s Song, the song that is gonna be added
     */
	public void addPlaylistSong(Song s){
		boolean encontro = false;
		int i = 0;
		while(i < 5 && !encontro){
			if(songs[i]!= null && songs[i] == s){
				System.out.println("No pueden agregarse dos veces la misma cancion");
				encontro = true;
			}
			if(songs[i] == null){
				songs[i] = s;
				encontro = true;
				duration = duration + s.getDuration();
			}
			i++;
		}
		if(!encontro){
			System.out.println("No pueden crearse mas canciones");	
		}
		i = 0;
		while(i < 10){
			if(genres[i] != null){
				genres[i] = s.getGenre();
			}
		}
		duration += s.getDuration();
	}
	/** 
     * this method updates te amount of songs in the playlist
     * <b>pre:</b> it must have been called by a method on msc
     * <b>post:</b> the amount of songs is updated
     */
	public void calulateCantSongs(){
		for(int i = 0; i < 5; i++){
			if(songs[i] != null){
				cantSongs++;
			}
		}
	}
	public void changeScore(int sc){
		calulateCantSongs();
		this.score = ((score * cantSongs) + sc) / cantSongs;
	}
	/** 
     * this method swous the information of the playlist
     * <b>pre:</b> it must have been called by a method on msc
     * <b>post:</b> the playlist information
     * @return String, the playlist information
     */
	//toString
	public String toString(){
		return "**************  Playlist **************" + "\n**  Title: " + name + "\n**  Duration: " 
		         + duration/60 + ":" + (duration%60) +
				 "\n**  Genres: " + getGenres() + "\n**  Score: " + score;
	}
	//get
	public double getScore(){
		return this.score;
	}
	//set
	public void setScore(double s){
		this.score = s;
	}
}