import java.io.FileWriter;
import java.io.IOException;

public class SvgScene {

    private Shape[]  shapes = new Shape[3];
    private int index = 0;
    public void addShapes(Shape s){
       shapes[index] = s;
       index++;
       if(index == shapes.length) {
           index = 0;
       }
    }
    public String toSvg() {
        String res = "";
        for(Shape s : shapes) {
            if(s != null) {
                res += s.toSvg();
            }
        }
        return res;
    }

    public void save(String path) {
        double minX = Double.MAX_VALUE;
        double minY = Double.MAX_VALUE;
        double maxX = Double.MIN_VALUE;
        double maxY = Double.MIN_VALUE;
        for(Shape s : shapes) {
            if(s == null){continue;}
            BoundingBox b = s.boundingBox();
            if(b.x() < minX) {minX = b.x();}
            if(b.y() < minY) {minY = b.y();}

            if(b.x() + b.width() > maxX) {maxX = b.x() + b.width();}
            if(b.y() + b.height() > maxY) {maxY = b.y() + b.width();}
        }
        double width = maxX - minX;
        double height = maxY - minY;
        String svg = "<svg width='" + width + "' height='" + height + "' xmlns=\"http://www.w3.org/2000/svg\">\n" ;
        for(Shape s : shapes) {
            if(s != null) {
                svg += s.toSvg() + "\n";
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
