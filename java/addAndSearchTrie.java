class TrieNode{
    TrieNode[] children = new TrieNode[26];
    boolean isEnd = false;;
}
class WordDictionary {

TrieNode root = new TrieNode();
    public WordDictionary() {

    }

    public void addWord(String word) {
        TrieNode cur = root;
        for(char c: word.toCharArray()){
            int i = c - 'a';
            if (cur.children[i] == null){
                cur.children[i] = new TrieNode();
            }
            cur = cur.children[i];
        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        return dfs(root,0,word);
    }

    private boolean dfs(TrieNode node, int i , String word){
        if (i == word.length()) return node.isEnd;
        char c = word.charAt(i);

        if (c == '.'){
            for(int j = 0; j< 26; j++){
                if (node.children[j] != null ){
                    if (dfs(node.children[j], i+1, word)) return true;
                }
            }
            return false;
        }
        else{
            int j = c - 'a';
            if (node.children[j] == null) return false;
            return dfs(node.children[j] , i+1 , word);
        }

    }
}
