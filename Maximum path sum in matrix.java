// function code :

algorithm...

1. initialise res=-1, and find maximum in first row and make it equal to res.
2. possible movements are down, diagonal left and diagonal right.
3. follow below

for (int i = 1; i < N; i++)  
        { 
            res = -1; 
            for (int j = 0; j < M; j++)  
            { 
                // When all paths are possible 
                if (j > 0 && j < M - 1) 
                    mat[i][j] += max(mat[i - 1][j], 
                                 max(mat[i - 1][j - 1],  
                                    mat[i - 1][j + 1])); 
  
                // When diagonal right is not possible 
                else if (j > 0) 
                    mat[i][j] += max(mat[i - 1][j], 
                                    mat[i - 1][j - 1]); 
  
                // When diagonal left is not possible 
                else if (j < M - 1) 
                    mat[i][j] += max(mat[i - 1][j], 
                                mat[i - 1][j + 1]); 
  
                // Store max path sum 
                res = max(mat[i][j], res); 
            } 
        } 
        return res;



