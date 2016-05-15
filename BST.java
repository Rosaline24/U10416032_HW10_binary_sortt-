public class BST{

	Node root;
	public void addNode(int key){
		Node newNode = new Node(key);
		if(root == null){
			root = newNode;
		}else{
			Node focusNode = root;
			Node parent;
			
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
	public void inOrderTraverseTree(Node focusNode){
		if(focusNode != null){
			inOrderTraverseTree(focusNode.leftChild);
			
			System.out.println(focusNode.key);
			
			inOrderTraverseTree(focusNode.rightChild);
		}
	}
	
	
}
class Node{
	int key;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key){
		this.key = key;
	}
	
}