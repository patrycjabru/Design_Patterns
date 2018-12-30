public class XMLExportVisitor implements Visitor {
    @Override
    public void visitDot(Dot d) {
        System.out.println("Exporting dot: "+d.x+" "+d.y);
    }

    @Override
    public void visitRectangle(Rectangle r) {
        System.out.println("Exporting rectangle: "+r.x+" "+r.y+" "+r.height+" "+r.width);
    }
}
