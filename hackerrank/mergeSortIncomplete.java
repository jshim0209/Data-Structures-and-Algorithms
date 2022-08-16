private static void mergeSort(List<Integer> crr) {
        int length = crr.size();
        
        if(length < 2) {
            return;
        }
        
        int midIndex = length / 2;
        List<Integer> leftHalf = new ArrayList<>(midIndex);
        List<Integer> rightHalf = new ArrayList<>(length - midIndex);
        
        for(int i = 0; i < midIndex; i++) {
            leftHalf.get(i) = crr.get(i);
        }
        for(int i = midIndex; i < length; i++) {
            rightHalf.get(i - midIndex) = crr.get(i);
        }
        
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        
        merge(crr, leftHalf, rightHalf);
               
    }
    
    private static void merge(List<Integer> crr, List<Integer> leftHalf, List<Integer> rightHalf) {
        int leftSize = leftHalf.size();
        int rightSize = rightHalf.size();
        
        int i = 0, j = 0, k = 0;
        
        while(i < leftSize && j < rightSize) {
            if(leftHalf.get(i) <= rightHalf.get(j)) {
                crr.get(k) = leftHalf.get(i);
                i++;
            } else {
                crr.get(k) = rightHalf.get(j);
                j++;
            }
            k++;
        }
        
        while(i < leftSize) {
            crr.get(k) = leftHalf.get(i);
            i++;
            k++;
        }
        
        while(j < rightSize) {
            crr.get(k) = rightHalf.get(j);
            j++;
            k++;
        }
    }
    
    private static void printArray(List<Integer> crr) {
        for(Integer element : crr) {
            System.out.print(element + " ");
        }
    }
