class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s= new Stack<>();
        for (int ast :asteroids)
        {
            boolean destroyed =false;
           while (!s.isEmpty() && s.peek() > 0 && ast < 0) {
                if (s.peek() < -ast) {
                    s.pop();
                    continue;
                } else if (s.peek() == -ast) {
                    s.pop();
                }
                destroyed = true;
                break;
            }
            
            if (!destroyed) {
                s.push(ast);
            }
        }
        int[] result = new int[s.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = s.pop();
        }
        
        return result;
    }
}