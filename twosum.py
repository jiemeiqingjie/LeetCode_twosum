
def twoSum(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: List[int]
    """
    result = []
    for x in range(len(nums)-1,-1,-1):
        cha = target - nums[x]
        if (cha in nums) and (nums.index(cha)!=x):
            result.append(nums.index(cha))
            result.append(x)
            break
    return result

print(twoSum([3,2,3],6))