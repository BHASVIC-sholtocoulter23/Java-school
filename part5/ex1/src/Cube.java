public class Cube{
    int edgeLength;
    public Cube(int initEdgeLength){
        edgeLength = initEdgeLength;
    }
    public int volume(){
        return(edgeLength*edgeLength*edgeLength);
    }

    public String toString(){
        return("the lenth of the edge is " + String.valueOf(edgeLength) + " and the volume is " + String.valueOf(volume()));
    }
}
