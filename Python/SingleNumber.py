nums.sort()
i = 1
while i < len(nums):
    if nums[i] == nums[i-1]:
        i += 2
    if i == len(nums)-1:
        return nums[i]
    else:
        return nums[i+1]