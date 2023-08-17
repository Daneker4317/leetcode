class Solution:
    def kthLargestNumber(self, nums: List[str], k: int) -> str:
      num_list = []
      for index,item in enumerate(nums):
        num_list.append(int(item))

      sorted_list = sorted(num_list)
      return str(sorted_list[len(sorted_list) - k])