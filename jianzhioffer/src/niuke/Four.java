package niuke;

import java.util.Arrays;

public class Four {



    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        if(pre.length == 0 || in.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        for(int i = 0; i < in.length; i++){
            if(pre[0] == in[i]){
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in,0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in,i + 1, in.length));
            }
        }
        return root;
    }

    public static TreeNode constructBinaryTree(int[] pre, int preS, int preE, int[] in, int inS, int inE){
        if(preS > preE || inS > inE){
            return null;
        }
        TreeNode root = new TreeNode(pre[preS]);
        for(int i = inS; i <= inE; i++){
            if(in[i] == pre[preS]){
                root.left = constructBinaryTree(pre, preS + 1, preS + i - inS, in, inS, i - 1);
                root.right = constructBinaryTree(pre, preS + i - inS + 1, preE, in, i + 1, inE);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode root = reConstructBinaryTree(pre, in);
        System.out.println(root.val);
    }
}
