public class LightBoard {

    private boolean[][] lights;

    public LightBoard(int numRows, int numCols){
        lights = new boolean[numRows][numCols];
        for(int r = 0; r < numRows; r++){
            for(int c = 0; c < numCols; c++){
                double status = Math.random();
                if(status < 0.39){
                    lights[r][c] = true;
                } else {
                    lights[r][c] = false;
                }
            }
        }
    }

    public boolean evaluateLight(int row, int col){
        int oncount = 0;
        if(lights[row][col]){
            for(int i = 0; i < lights.length; i++){
                if(lights[i][col]){
                    oncount++;
                }
            }
        }
    }
}
