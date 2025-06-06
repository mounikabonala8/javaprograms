class node{
    int data;
    node left;
    node right;
    node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
        
    }
}
class tree
{
    node root;
    tree()
    {
        this.root=null;
    }
    void insert(int n)
    {
        node newnode=new node(n);
        if(this.root==null) this.root=newnode;
        else{
            node curr=this.root;
            while(true)
            {
                if(n>curr.data)
                {
                    if(curr.right==null)
                    {
                        curr.right=newnode;
                        break;
                    }
                    else{
                        curr=curr.right;
                    }
                    }
                    else{
                        if(curr.left==null)
                        {
                            curr.left=newnode;
                            break;
                        }
                        else{
                            curr=curr.left;
                        }
                        }
                    }
                }
            }
            void postorder(node root)
            {
                if(root!=null)
                {

                    postorder(root.left);
                    postorder(root.right);
                    System.out.println(root.data);
                }
            }
}
public class Postorder
{
	public static void main(String[] args) {
	    tree t=new tree();
	    t.insert(1);
	    t.insert(3);
	    t.insert(4);
	    t.postorder(t.root);
		
	}
}