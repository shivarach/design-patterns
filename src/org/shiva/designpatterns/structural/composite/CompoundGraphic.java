package org.shiva.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
// The composite class represents complex components that may
// have children. Composite objects usually delegate the actual
// work to their children and then "sum up" the result.
public class CompoundGraphic implements Graphic {

    private List<Graphic> children = new ArrayList<>();

    public void addGraphic(Graphic graphic) {
        this.children.add(graphic);
    }


    // A composite executes its primary logic in a particular
    // way. It traverses recursively through all its children,
    // collecting and summing up their results. Since the
    // composite's children pass these calls to their own
    // children and so forth, the whole object tree is traversed
    // as a result.
    @Override
    public void move(int x, int y) {
        children.forEach(graphic -> graphic.move(x, y));
    }

    @Override
    public void draw() {
        children.forEach(Graphic::draw);
    }
}
