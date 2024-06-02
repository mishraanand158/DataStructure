/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        
        if(node == null) {
            return null ;
        }
       Map <Node,Node> map = new HashMap<>();
        
        
        return testNode(node,map);
        
    }
    
    Node testNode(Node node,Map <Node,Node> map ){
        
        Node newNode  = new Node(node.val); // 1    
        map.put(node,newNode);
        
      
        for(Node neighborNode : node.neighbors) {  // 2 , 4 
            if(map.containsKey(neighborNode)){
                newNode.neighbors.add(map.get(neighborNode));
            }
            
            else{
                newNode.neighbors.add(testNode(neighborNode,map));
            } 
            
        }
        
    
    return newNode;
    }
}