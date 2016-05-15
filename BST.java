public class BST{

	Node root;
	public void addNode(int key){
		Node newNode = new Node(key);
		if(root == null){
			root = newNode;
		}else{
			Node focusNode = root;
			Node parent;
			//sort the number to left if it's small, and sort the big one to right
			while(true){
				parent = focusNode;
				if(key < focusNode.key){
					focusNode = focusNode.leftChild;
					if(focusNode == null){
						parent.leftChild = newNode;
						return;
					}
				}else{
					focusNode = focusNode.rightChild;
					if(focusNode == null){
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	//Create a method
	public void inOrderTraverseTree(Node focusNode){
		if(focusNode != null){
			inOrderTraverseTree(focusNode.leftChild);
			//print out the inorder numbers
			System.out.println(focusNode.key);
			
			inOrderTraverseTree(focusNode.rightChild);
		}
	}
	
	
}
class Node{
	int key;
	//Left subtree
	Node leftChild;
	//Right subtree
	Node rightChild;
	
	Node(int key){
		this.key = key;
	}
	
}