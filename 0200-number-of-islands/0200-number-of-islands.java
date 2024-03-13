class Solution {
            public int numIslands(char[][] grid) {

                boolean [][] visited=  new boolean [grid.length][grid[0].length];
                System.out.println(visited[0][0]);
                
                System.out.println((grid[0][0]=='1') );
                System.out.println((grid[0][0]=='1') && (visited[0][0] == false));
                

                int count = 0 ;
                for(int i = 0; i<grid.length ; i++){
                    for(int j = 0 ; j<grid[i].length ; j++){
                        if((grid[i][j]=='1') && (visited[i][j] == false)) {
                            count ++;
                            System.out.println(i +" "+j+" "+count);
                            getConnectedComponent(grid,i,j,visited);
                        }



                    }

                }

                return count ;
            }

            public void getConnectedComponent(char[][]grid,int i, int j,boolean[][]visited){

                if(i<0 || j<0 || i >= grid.length || j>= grid[0].length || grid[i][j]=='0'   ||   (visited[i][j] == true ))
                    return ;

                    visited[i][j] = true;
                    getConnectedComponent(grid,i+1,j,visited);
                    getConnectedComponent(grid,i,j+1,visited);
                    getConnectedComponent(grid,i-1,j,visited); 
                    getConnectedComponent(grid,i,j-1,visited); 
            }
}