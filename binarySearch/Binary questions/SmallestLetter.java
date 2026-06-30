public class SmallestLetter {
    /// Find the smallest letter greater than the target:celing (a->c)
    public static void main(String[] args) {
    char letters[]={'c','e','f','i','n'};
    char target='d';
   System.out.println(SmallestLetter(letters, target));
    }


    public static char SmallestLetter(char[]letters,char target){
        int start=0;
        int end = letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}


/*public class SmallestLetter {
    /// Q: Find the smallest letter greater than the target
    /// Example: letters = {'c','e','f','i','n'}, target = 'd'
    /// Answer should be 'e' (because 'e' is the smallest letter just bigger than 'd')

    public static void main(String[] args) {
        char letters[] = {'c','e','f','i','n'};
        char target = 'd';
        System.out.println(SmallestLetter(letters, target));  // Expected output: e
    }

    // Function to find the "next greatest letter" using Binary Search
    public static char SmallestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        // -------------------------------
        // 🔁 Binary Search Loop
        // Keep searching while start <= end
        // -------------------------------
        while(start <= end){
            int mid = start + (end - start) / 2; // middle index

            // CASE 1: if target < letters[mid]
            // → we must search on LEFT half
            if(target < letters[mid]){
                end = mid - 1;
            }

            // CASE 2: if target >= letters[mid]
            // → we must search on RIGHT half
            else{
                start = mid + 1;
            }
        }

        // -------------------------------
        // After loop ends:
        // "start" is pointing to the index where
        // the next greatest letter should be.
        //
        // ⚠️ Problem: If target is greater than or equal to
        // the last element, then start will move
        // beyond array (start = letters.length).
        //
        // To handle this, we do:
        // start % letters.length
        // This wraps around (circular array).
        // -------------------------------
        return letters[start % letters.length];
    }
}

/*
----------------------------------------
🔎 Step-by-Step Example
letters = {c, e, f, i, n}, target = 'd'

Initial: start=0, end=4

1️⃣ mid = (0+4)/2 = 2 → letters[2]=f
   target='d' < 'f' → move left
   end = mid-1 = 1
   (start=0, end=1)

2️⃣ mid = (0+1)/2 = 0 → letters[0]=c
   target='d' > 'c' → move right
   start = mid+1 = 1
   (start=1, end=1)

3️⃣ mid = (1+1)/2 = 1 → letters[1]=e
   target='d' < 'e' → move left
   end = mid-1 = 0
   (start=1, end=0) → loop ends

✅ Answer = letters[start] = letters[1] = 'e'

----------------------------------------
Special Case:
target = 'n'
→ start will become 5 (out of array)
→ we return letters[start % length]
= letters[5 % 5] = letters[0] = 'c' (wrap around)
----------------------------------------
*/ 