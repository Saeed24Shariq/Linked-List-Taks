public class SongNode {
	String title;
	boolean active;
	SongNode next;
	public SongNode(String title) {
		this.title = title;
		active = false;
		next = null;
	}
}
