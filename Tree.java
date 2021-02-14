import java.util.*;
public class Tree {

	private Node root; 

	 public Tree() 
	{ root = null; } 
	public Node find(int key) 
	{ 
		Node current = root; // start at root
		while(currzxc * ent.iData != key) 
		{
		if(key < current.iData) 
		current = current.leftChild;
		else // or go right?
		current = current.rightChild;
		if(current == null) // if no child,
		return null; // didn�t find it
		}
		return current; // found it
	} // end find()
	
	public void insert(int id, double dd)
	{
	Node newNode = new Node(); 
	newNode.iData = id; // insert data
	newNode.dData = dd;
	if(root==null) // no node in root
	root = newNode;
	else // root occupied
	{
	Node current = root; // start at root
	Node parent;
	while(true) // (exits internally)
	{
		parent = current;
		if(id < current.iData) 
		{
		current = current.leftChild;
		if(current == null) // if end of the line,
		{ // insert on left
		parent.leftChild = newNode;
		return;
		}
		} // end if go left
		else // or go right?
		{
		current = current.rightChild;
		if(current == null) // if end of the line
		{ // insert on right
		parent.rightChild = newNode;
		return;
		}
		} 
		} 
		} 
	} 

	public void displayTree()
	{
	Stack globalStack = new Stack();
	globalStack.push(root);
	int nBlanks = 32;
	boolean isRowEmpty = false;
	System.out.println("......................................................");
	while(isRowEmpty==false)
	{
	Stack localStack = new Stack();
	isRowEmpty = true;
	for(int j=0; j<nBlanks; j++)
	System.out.print(" ");
	while(globalStack.isEmpty()==false)
	{
	Node temp = (Node)globalStack.pop();
	if(temp != null)
	{
	System.out.print(temp.iData);
	localStack.push(temp.leftChild);
	localStack.push(temp.rightChild);
	if(temp.leftChild != null ||
	temp.rightChild != null)
	isRowEmpty = false;
	}
	else
	{
	System.out.print("--");
	localStack.push(null);
	localStack.push(null);
	}
	for(int j=0; j<nBlanks*2-2; j++)
	System.out.print(" " );
	} // end while globalStack not empty
	System.out.println();
	nBlanks /= 2;
	while(localStack.isEmpty()==false)
	globalStack.push( localStack.pop() );
	} // end while isRowEmpty is false
	System.out.println("......................................................");
	} // end displayTree()
	
	public boolean delete(int key) 
	{ // (assumes non-empty list)
	Node current = root;
	Node parent = root;
	boolean isLeftChild = true;
	while(current.iData != key) 
	{
	parent = current;
	if(key < current.iData) // go left?
	{
	isLeftChild = true;
	current = current.leftChild;
	}
	else // or go right?
	{
	isLeftChild = false;
	current = current.rightChild;
	}
	if(current == null) // end of the line,
	return false; // didn�t find it
	} // end while
	// found node to delete
	// if no children, simply delete it
	if(current.leftChild==null &&
	current.rightChild==null)
	{
	if(current == root) // if root,
	root = null; // tree is empty
	else if(isLeftChild)
		parent.leftChild = null; // disconnect
		else // from parent
		parent.rightChild = null;
		}
		// if no right child, replace with left subtree
		else if(current.rightChild==null)
		if(current == root)
		root = current.leftChild;
		else if(isLeftChild)
		parent.leftChild = current.leftChild;
		else
		parent.rightChild = current.leftChild;
		// if no left child, replace with right subtree
		else if(current.leftChild==null)
		if(current == root)
		root = current.rightChild;
		else if(isLeftChild)
		parent.leftChild = current.rightChild;
		else
		parent.rightChild = current.rightChild;
		else {
		Node successor = getSuccessor(current);
		if(current == root)
			root = successor;
		else if(isLeftChild)
		parent.leftChild = successor;
		else
		parent.rightChild = successor;
		// connect successor to current�s left child
		successor.leftChild = current.leftChild;
		} // end else two children
		// (successor cannot have a left child)

		return true; // success
		} // end delete()
	private Node getSuccessor(Node delNode)
	{
	Node successorParent = delNode;
	Node successor = delNode;
	Node current = delNode.rightChild; 
	while(current != null) // until no more
	{ 
	successorParent = successor;
	successor = current;
	current = current.leftChild; // go to left child
	}
	if(successor != delNode.rightChild) // right child,
	{ 
		successorParent.leftChild = successor.rightChild;
		successor.rightChild = delNode.rightChild;
		}
		return successor;
		}

	
	public void traverse(int traverseType)
	{
	switch(traverseType)
	{
	case 1: System.out.print("\nPreorder traversal: ");
	preOrder(root);
	break;
	case 2: System.out.print("\nInorder traversal: ");
	inOrder(root);
	break;
	case 3: System.out.print("\nPostorder traversal: ");
	postOrder(root);
	break;
	}
	System.out.println();
	}
	private void preOrder(Node localRoot)
	{
		if(localRoot != null)
		{
		System.out.print(localRoot.iData + "  ");
		preOrder(localRoot.leftChild);
		preOrder(localRoot.rightChild);
		}
		}
		private void inOrder(Node localRoot)
		{
		if(localRoot != null)
		{
		inOrder(localRoot.leftChild);
		System.out.print(localRoot.iData + " ");
		inOrder(localRoot.rightChild);
		}
		}
		private void postOrder(Node localRoot)
		{
		if(localRoot != null)
		{
		postOrder(localRoot.leftChild);
		postOrder(localRoot.rightChild);
		System.out.print(localRoot.iData +" ");
		}
		}
	
	
                
                
                rec(){
                    print(*)
                }
                
                for()
}
