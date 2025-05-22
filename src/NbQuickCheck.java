import java.util.List;
import java.util.Map;

public class NbQuickCheck {
//
  /**
   * Performs a pre-order traversal of the tree, printing each node on a separate line.
   * Does nothing if the root is not present in the tree.
   *
   * @param tree the tree represented as a map of parent nodes to child lists
   * @param root the root node to start traversal from
   */
  public static void preOrder(Map<Integer, List<Integer>> tree, int root) {
    
    helper(tree, root);
  }

  public static void helper(Map<Integer, List<Integer>> tree, int root)
  {
    if(tree == null) return;

    System.out.println(root);
    for(Integer i : tree.get(root))
    {
      helper(tree, i);
    }
    
  }

  /**
   * Returns the minimum value in the tree.
   * Returns Integer.MAX_VALUE if the root is null.
   *
   * @param root the root node of the tree
   * @return the minimum value in the tree or Integer.MAX_VALUE if root is null
   */
  public static int minVal(Node<Integer> root) {
    return helper(root, Integer.MAX_VALUE);
  }
  
  public static int helper(Node<Integer> root, int min)
  {
    if(root == null || root.children == null) return min;
    if(root.value < min)
    {
      min = root.value;
    }
    
    min = helper(root, min);

    return min;
  }
}
