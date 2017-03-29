package InitDnepr.Tree;

import java.util.ArrayList;

/**
 * Created by d1mys1klapo4ka on 30.03.2017.
 */
public class Trees {

    public static void main(String[] args) {

        System.out.println(Tree.getCount());

        ArrayList<Tree> tree = new ArrayList<Tree>();

        tree.add(new Tree("Pine", 5.4));
        tree.add(new Tree("Oak", 4.6));
        tree.add(new Tree("Birth", 6.2));
        tree.add(new Tree("Maple", 5.5));
        tree.add(new Tree("Poplar", 3.1));

        for (int i = 0, n = Tree.getInt(); i < n; i++){

            tree.add(new Tree(Tree.DEFAULT_NAME));
        }
//        Tree[] tree = new Tree[Tree.getCount()];
//
//        tree[0] = new Tree("Pine", 5.4);
//        tree[1] = new Tree("Oak", 4.6);
//        tree[2] = new Tree("Birth", 6.2);
//        tree[3] = new Tree("Maple", 5.5);
//        tree[4] = new Tree("Poplar", 3.1);
//
//        for (int i = Tree.getCount(); i < 10; i++){
//            tree[i] = new Tree(Tree.DEFAULT_NAME);
//        }

        for (int i = 0; i < Tree.getCount(); i++) {
            tree.get(i).printInformation();
        }

        System.out.println(Tree.getCount());
    }
}
