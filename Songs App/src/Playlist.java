public class Playlist {
	SongNode start;
	
	public Playlist() {
		start = null; 
	}
	
	public void addSong(String title) {
		SongNode newNode = new SongNode(title);
		
		if(start == null) {
			start = newNode;
			start.active = true;
		}
		else {
			SongNode lastNode = searchLast();
			lastNode.next = newNode;
		}
		System.out.println(title + " added to the playlist");
	}
	
	public void removeSong(String title) {
		SongNode previousSong = searchPrevious(title);
		SongNode nextSong = searchNext(title);
		previousSong.next = nextSong;
	}
	
	public void nextSong() {
		SongNode active = activeSearch();
		active.active = false;
		active.next.active = true;
	}
	
	public void previousSong() {
		SongNode active = activeSearch();
		active.active = false;
		SongNode previousSong = searchPrevious(active.title);
		previousSong.active = true;
	}
	
	public SongNode searchNext(String title) {
		SongNode temp = start;
		while(temp.next != null) {
			if(temp.title == title) {
				return temp.next;
			}
			temp = temp.next;
		}
		return null;
	}
	
	public SongNode searchPrevious(String title) {
		SongNode temp = start;
		while(temp.next.title != title) {
			temp = temp.next;
		}
		return temp;
	}
	
	public SongNode activeSearch() {
		SongNode temp = start;
		while(temp.active != true) {
			temp = temp.next;
		}
		return temp;
	}
	
	public SongNode searchLast() {
		SongNode temp = start;
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp;
	}
	
	public void displaySong() {
		SongNode temp = start;
		System.out.println("PlayList: ");
		while(temp != null) {
			System.out.println("	* " + temp.title);
			temp = temp.next;
		}
	}
}
