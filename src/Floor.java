public class Floor {

  private int[][] floor;

  public void setFloor() {
    this.floor = new int[][]{{1, 0},{1, 0}};
  }

  public Floor(int w, int h, int percentDirty) {
    this.setFloor();
  }

  public int getFloorLoc(int x, int y){
    return this.floor[x][y];
  }

  public void setFloorLoc(int x, int y, int value){
    this.floor[x][y] = value;
  }
}
