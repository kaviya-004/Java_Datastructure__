class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

 public class TREE_CRUD {
    static TreeNode root;

    public TREE_CRUD(int[] elements) {
        for (int element : elements) {
            insert(root, element);
        }
    }

    // Insert method remains the same
    private static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Read (Search)
    public boolean search(int val) {
        return searchRecursive(root, val);
    }

    private boolean searchRecursive(TreeNode root, int val) {
        if (root == null) {
            return false;
        }
        if (root.val == val) {
            return true;
        }
        return val < root.val ? searchRecursive(root.left, val) : searchRecursive(root.right, val);
    }

    // Update
    public void update(int oldValue, int newValue) {
        delete(oldValue);
        insert(root, newValue);
    }

    // Delete
    public void delete(int val) {
        root = deleteRecursive(root, val);
    }

    private TreeNode deleteRecursive(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val < root.val) {
            root.left = deleteRecursive(root.left, val);
        } else if (val > root.val) {
            root.right = deleteRecursive(root.right, val);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.val = findMinValue(root.right);
            root.right = deleteRecursive(root.right, root.val);
        }
        return root;
    }

    private int findMinValue(TreeNode node) {
        int min = node.val;
        while (node.left != null) {
            min = node.left.val;
            node = node.left;
        }
        return min;
    }
    public void insert(int val) {
        root = insert(root, val);
    }

    public static void main(String[] args) {
        int[] elements = {10, 5, 15, 3, 7, 12, 17};
        TREE_CRUD tree = new TREE_CRUD(elements);
        root=insert(null,3);
        System.out.println(root.val);
        
    }
}
