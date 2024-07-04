let index: number;

function searchInsert(nums: number[], target: number): number {
    
    if (isTargetInArray(nums, target)) {
        return index;
    }

    determineInsertPosition(nums, target);

    return index;
};

function isTargetInArray(nums: number[], target: number): boolean {

    let isTargetInArray: boolean = false;

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === target) {
            index = i;
            isTargetInArray = true;
        }
    }

    return isTargetInArray;
}

function determineInsertPosition(nums: number[], target: number): void {

    if (target < nums[0]) {
        index = 0;
        return;
    }

    if (target > nums[nums.length - 1]) {
        index = nums.length;
        return;
    }
    
    for (let i = 0; i < nums.length; i++) {
        if (target < nums[i]) {
            index = i;
            return;
        }
    }
}

console.log(searchInsert([1,3,5,6], 5));
console.log(searchInsert([1,3,5,6], 2));
console.log(searchInsert([1,3,5,6], 7));
console.log(searchInsert([1,3,5,6], 4));
console.log(searchInsert([1,3,5,6], 6));