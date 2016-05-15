public class TestBST{
	public static void main(String[] args){
		
		BST theTree = new BST();
		
		theTree.addNode(50);
		theTree.addNode(80);
		theTree.addNode(23);
		theTree.addNode(41);
		theTree.addNode(52);
		theTree.addNode(93);
		theTree.addNode(18);
		theTree.addNode(30);
		theTree.addNode(72);
		
		theTree.inOrderTraverseTree(theTree.root);
	}
}