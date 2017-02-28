import java.util.ArrayList;


/**
 * Class contains a node of a tree
 * @author jfran
 *
 */
public class Node {
	public String name;
	public ArrayList<Node> children;
	
	public Node (String val){
		name = val;
		children = new ArrayList<Node>();
	}
	
	public boolean add(String parent,String child){
		boolean success = false;
		if (name.equalsIgnoreCase(parent)){
			addChild(child);
			return true;
		}
		else{
			for (Node n : children){
				success = n.add(parent, child);
			}
		}
		return success;
	}
	
	public void addChild(String child){
		Node kid = new Node(child);
		children.add(kid);
	}
	
	public void disp(){
		
		if (children.isEmpty()){
			System.out.println(name);
		}
		else{
			System.out.println(name + "parent of: ");
			for (Node n: children){
				n.disp();
			}
		}
	}
	
	/**
	 * Method to check if a node is parent of its children
	 * recursively implemented
	 * @param parent 
	 * @param child
	 * @return true if the two are parent and child
	 */
	public boolean checkParent(String parent, String child) {
		boolean check = false;
		if (name.equalsIgnoreCase(parent)){
			for (Node n: children){
				if (n.name.equalsIgnoreCase(child)){
//				System.out.println(child);
				System.out.println("Found");
				return true;
				}
			}
		}
		else {
			if (children.size() > 0){
				for (Node n : children){
					check = n.checkParent(parent, child);
					return check;
				}
			}
		}
		return check;
		
	}

	/**
	 * Method to check ancestor relations
	 * @param a supposed ancestor
	 * @param b supposed descendant
	 * @return true if a is an ancestor of b
	 */
	public boolean checkAncestor(String a, String b) {
		if (name.equalsIgnoreCase(a)){
//			findDescendant(b);
		}
		return false;
	}
}
