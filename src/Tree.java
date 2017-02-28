/**
 * Tree structure to create a tree data structures
 * @author jfran
 * @param <T> type to take in
 */
public class Tree {
	private Node root;
	
	/**
	 * Constructor for the tree class
	 */
	public Tree (){
	}
	
	/**
	 * class to add a parent child relationship to the family tree
	 * @param parent 
	 * @param child
	 */
	public void add(String parent, String child){
		if (root == null){
			Node m = new Node(parent);
			root = m;
			root.addChild(child);
		}
		else {
			root.add(parent, child);
		}
	}
	
	/**
	 * Method to check if it is parents
	 * @param parent name of person to check 
	 * @param child name of child
	 * @return true if parent and not
	 */
	public boolean isParent(String parent, String child){
		boolean condition = root.checkParent(parent, child);
		
		return condition;
	}
	
	/**
	 * Method to check if two strings are a parent/child relationship
	 * @param child 
	 * @param parent
	 * @return true if child is the child of the parent in the tree
	 */
	public boolean isChild(String child, String parent){
		boolean check = root.checkParent(parent, child);
		return check;
	}
	
	/**
	 * Method to check if two objects are in the same lineage
	 * @param a supposed ancestor
	 * @param b supposed descendant
	 * @return true if a is an ancestor of b
	 */
	public boolean isAncestor(String a, String b){
		boolean check = root.checkAncestor(a, b);
		return check;
	}
	
	/**
	 * A method to display trees
	 */
	public void diplayTree(){
		root.disp();
	}
}
