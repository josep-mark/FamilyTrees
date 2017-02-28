
public class TreeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateTreeFromFile cf = new CreateTreeFromFile("house-lannister.txt");
		Tree lannisters = cf.getTree();
//		lannisters.diplayTree();
		System.out.println(lannisters.isParent("Tytos", "Kevan"));
	}


}
