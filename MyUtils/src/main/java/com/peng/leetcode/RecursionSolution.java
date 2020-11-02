package com.peng.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author peng.wang
 * @Description 递归
 * @createTime 2020/7/1
 */
public class RecursionSolution {

    private List<String> result = new ArrayList<>();

    private String[] letterMap = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};


    /**
     * 17 号码组合
     *
     * @param digits
     * @return
     */
    public List<String> letterCombinations(String digits) {

        if (digits.equals("")) {
            return result;
        }
        findCombination(digits, 0, "");
        return result;
    }

    public void findCombination(String digits, int index, String s) {
        if (digits.length() == index) {
            result.add(s);
            return;
        }
        char c = digits.charAt(index);
        String letters = letterMap[c - '0'];
        for (int i = 0; i < letters.length(); i++) {
            findCombination(digits, index + 1, s + letters.charAt(i));
        }


    }

    /**
     * leetcode 22括号生成
     *
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesis4Recursion("", n, n, result);
        return result;
    }

    public void generateParenthesis4Recursion(String cur, int leftCount, int rightCount, List<String> result) {
        if (leftCount == 0 && rightCount == 0) {
            result.add(cur);
        }
        if (leftCount > 0) {
            generateParenthesis4Recursion(cur + "(", leftCount - 1, rightCount, result);
        }
        if (leftCount < rightCount) {
            generateParenthesis4Recursion(cur + ")", leftCount, rightCount - 1, result);
        }
    }

    /**
     * 39 组合总和
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        if (candidates == null || candidates.length == 0 || target < 0) {
            return result;
        }
        List<Integer> list = new ArrayList<>();
        dfs4CombinationSum(0, candidates, target, result, list);
        return result;
    }

    public void dfs4CombinationSum(int start, int[] candidates, int target, List<List<Integer>> result, List<Integer> list) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(list));
        } else {
            for (int i = start; i < candidates.length; i++) {
                list.add(candidates[i]);
                dfs4CombinationSum(i, candidates, target - candidates[i], result, list);
                list.remove(list.size() - 1);
            }
        }

    }

    /**
     * 46 全排列
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfsPermute(nums, result, list);
        return result;
    }

    public void dfsPermute(int[] nums, List<List<Integer>> result, List<Integer> list) {

        if (nums == null || nums.length == 0) {
            return;
        }
        if (nums.length == list.size()) {
            result.add(new ArrayList<Integer>(list));
            return;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (list.contains(nums[i])) {
                    continue;
                }
                list.add(nums[i]);
                dfsPermute(nums, result, list);
                list.remove(list.size() - 1);
            }
        }

    }

    /**
     * 78 子集
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return results;
        }
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        dfs4Subsets(nums, 0, list, results);
        return results;
    }

    private void dfs4Subsets(int[] nums, int start, List<Integer> list, List<List<Integer>> results) {

        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            results.add(new ArrayList<>(list));
            dfs4Subsets(nums, i + 1, list, results);
            list.remove(list.size() - 1);

        }

    }

    /**
     * 79 单次搜索
     *
     * @param board
     * @param word
     * @return
     */
    public boolean exist(char[][] board, String word) {

        int col = board.length;
        int row = board[0].length;

        boolean[][] findPath = new boolean[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (dfs4Word(board, word, findPath, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;

    }

    private boolean dfs4Word(char[][] board, String word, boolean[][] findPath, int i, int j, int index) {

        int col = board.length;
        int row = board[0].length;

        if (word.length() == index) {
            return true;
        }
        if (i < 0 || i >= col || j < 0 || j >= row) {
            return false;
        }
        if (findPath[i][j] || word.charAt(index) != board[i][j]) {
            return false;
        }
        findPath[i][j] = true;
        //四个方向寻找
        boolean result = dfs4Word(board, word, findPath, i + 1, j, index + 1)
                || dfs4Word(board, word, findPath, i - 1, j, index + 1)
                || dfs4Word(board, word, findPath, i, j + 1, index + 1)
                || dfs4Word(board, word, findPath, i, j - 1, index + 1);
        findPath[i][j] = false;
        return result;
    }


    /**
     * 200岛屿数量
     *
     * @param grid
     * @return
     */
    public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }
        int length = grid.length;
        int weight = grid[0].length;
        int numLand = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < weight; j++) {
                if (grid[i][j] == '1') {
                    ++numLand;
                    dfs4NumIsLands(grid, i, j);
                }
            }
        }

        return numLand;

    }

    private void dfs4NumIsLands(char[][] grid, int i, int j) {

        int length = grid.length;
        int weight = grid[0].length;
        if (i < 0 || j < 0 || i >= length || j >= weight || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs4NumIsLands(grid, i - 1, j);
        dfs4NumIsLands(grid, i + 1, j);
        dfs4NumIsLands(grid, i, j - 1);
        dfs4NumIsLands(grid, i, j + 1);

    }

    /**
     * 20 课程表（图、dfs）
     *
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites == null || prerequisites.length == 0) {
            return true;
        }
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            graph.get(prerequisite[1]).add(prerequisite[0]);
        }
        int[] flag = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!dfs4CanFinish(flag, i, graph)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs4CanFinish(int[] flag, int i, List<List<Integer>> graph) {

        if (flag[i] == 1) {
            return false;
        }
        if(flag[i]==-1){
            return true;
        }
        flag[i]=1;

        for (Integer cur : graph.get(i)) {
            if(!dfs4CanFinish(flag,cur,graph)){
                return false;
            }
        }
        flag[i]=-1;
        return true;
    }

}
