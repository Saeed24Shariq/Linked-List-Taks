public class Main {
	public static void main(String args[]) {
		Playlist playlist = new Playlist();
		playlist.addSong("Afsos");
		playlist.addSong("Qismat");
		playlist.addSong("Judge");
		playlist.displaySong();
		playlist.removeSong("Qismat");
		playlist.displaySong();
		System.out.println(playlist.activeSearch().title);
		playlist.nextSong();
		System.out.println(playlist.activeSearch().title);
		playlist.previousSong();
		System.out.println(playlist.activeSearch().title);
	}
}
