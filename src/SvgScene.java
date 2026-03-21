import java.io.FileWriter;
import java.io.IOException;

public class SvgScene {

    private Polygon[]  polygon = new Polygon[3];
    private int index = 0;
    public void addPolygon(Polygon p){
       polygon[index] = p;
       index++;
       if(index == polygon.length) {
           index = 0;
       }
    }
    public String toSvg() {
        String res = "";
        for(Polygon p : polygon) {
            if(p != null) {
                res += p.toSvg();
            }
        }
        return res;
    }

    public void save(String path) {
        double minX = Double.MAX_VALUE;
        double minY = Double.MAX_VALUE;
        double maxX = Double.MIN_VALUE;
        double maxY = Double.MIN_VALUE;
        for(Polygon p : polygon) {
            if(p == null){continue;}
            BoundingBox b = p.boundingBox();
            if(b.x() < minX) {minX = b.x();}
            if(b.y() < minY) {minY = b.y();}

            if(b.x() + b.width() > maxX) {maxX = b.x() + b.width();}
            if(b.y() + b.height() > maxY) {maxY = b.y() + b.width();}
        }
        double width = maxX - minX;
        double height = maxY - minY;
        String svg = "<svg width='" + width + "' height='" + height + "' xmlns=\"http://www.w3.org/2000/svg\">\n" ;
        for(Polygon p : polygon) {
            if(p != null) {
                svg += p.toSvg() + "\n";
            }
        }
        svg += "</svg>";
        try {
            FileWriter writer= new FileWriter(path);
            writer.write(svg);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
