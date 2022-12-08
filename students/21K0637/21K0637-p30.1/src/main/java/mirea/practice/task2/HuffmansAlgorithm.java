package mirea.practice.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HuffmansAlgorithm {
    private final String inputString;
    private final CodeTreeNode tree;
    private Map<Character, Integer> frequencyDictionary;


    public HuffmansAlgorithm(String inputString) {
        this.inputString = inputString;
        setFrequencyDictionary();
        List<CodeTreeNode> codeTreeNodeList = new ArrayList<>();
        for (Character c : frequencyDictionary.keySet()) {
            codeTreeNodeList.add(new CodeTreeNode(c, frequencyDictionary.get(c)));
        }
        tree = huffman(codeTreeNodeList);
    }

    public Map<Character, Integer> getFrequencyDictionary() {
        return frequencyDictionary;
    }

    public Map<Character, String> getTree() {
        Map<Character, String> codes = new TreeMap<>();
        for (Character c : frequencyDictionary.keySet()) {
            codes.put(c, tree.getCodeForCharacter(c, ""));
        }
        return codes;
    }

    private void setFrequencyDictionary() {
        frequencyDictionary = new TreeMap<>();
        for (int i = 0; i < this.inputString.length(); i++) {
            char ch = this.inputString.charAt(i);
            frequencyDictionary.compute(ch, (character, integer) -> integer == null ? 1 : integer + 1);
        }
    }

    public CodeTreeNode huffman(List<CodeTreeNode> codeTreeNodes) {
        while (codeTreeNodes.size() > 1) {
            Collections.sort(codeTreeNodes);
            CodeTreeNode left = codeTreeNodes.remove(codeTreeNodes.size() - 1);
            CodeTreeNode right = codeTreeNodes.remove(codeTreeNodes.size() - 1);

            CodeTreeNode parent = new CodeTreeNode(null, left.weight + right.weight, left, right);
            codeTreeNodes.add(parent);
        }
        return codeTreeNodes.get(0);
    }

    private static class CodeTreeNode implements Comparable<CodeTreeNode> {
        private final Character content;
        private final int weight;
        private CodeTreeNode left;
        private CodeTreeNode right;

        public CodeTreeNode(Character content, int weight) {
            this.content = content;
            this.weight = weight;
        }

        public CodeTreeNode(Character content, int weight, CodeTreeNode left, CodeTreeNode right) {
            this.content = content;
            this.weight = weight;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(CodeTreeNode o) {
            return o.weight - weight;
        }

        public String getCodeForCharacter(Character ch, String parentPath) {
            if (content.equals(ch)) {
                return parentPath;
            } else {
                if (left != null) {
                    String path = left.getCodeForCharacter(ch, parentPath + 0);
                    if (path != null) {
                        return path;
                    }
                }
                if (right != null) {
                    String path = right.getCodeForCharacter(ch, parentPath + 1);
                    if (path != null) {
                        return path;
                    }
                }
            }
            return null;
        }
    }
}
