class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        u = nums1 + nums2
        u.sort()
        a = len(u)
        if a % 2 == 0:  # If the number of elements is even
            b = a // 2 - 1
            c = b + 1
            median = (u[c] + u[b]) / 2.0  # Return as float
        else:  # If the number of elements is odd
            o = a // 2
            median = u[o]

        return median