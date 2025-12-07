package edu.touro.mcon264.l5_find_middle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {

        // Test 1: Odd-length list (normal case)
        @Test
        public void testOddLengthList() {
            // build linked list: 1 → 2 → 3 → 4 → 5
            Solution.ListNode list1 = new Solution.ListNode(1);
            list1.next = new Solution.ListNode(2);
            list1.next.next = new Solution.ListNode(3);
            list1.next.next.next = new Solution.ListNode(4);
            list1.next.next.next.next = new Solution.ListNode(5);

            // call the method
            Solution.ListNode middle = Solution.middleNode(list1);

            // verify the result
            assertEquals(3, middle.val);
        }

        // Test 2: Even-length list (normal case)
        @Test
        public void testEvenLengthList() {
            // build linked list: 1 → 2 → 3 → 4 → 5 → 6
            Solution.ListNode list2 = new Solution.ListNode(1);
            list2.next = new Solution.ListNode(2);
            list2.next.next = new Solution.ListNode(3);
            list2.next.next.next = new Solution.ListNode(4);
            list2.next.next.next.next = new Solution.ListNode(5);
            list2.next.next.next.next.next = new Solution.ListNode(6);

            // call the method
            Solution.ListNode middle = Solution.middleNode(list2);

            // verify the result (expect the SECOND middle = 4)
            assertEquals(4, middle.val);
        }

        // Test 3: Single-node list (edge case)
        @Test
        public void testSingleNodeList() {
            // Build list: 1
            Solution.ListNode list3 = new Solution.ListNode(1);

            // Run the method
            Solution.ListNode middle = Solution.middleNode(list3);

            // Verify result → expected 1
            assertEquals(1, middle.val);
            // Optionally, confirm it has no next node
            assertNull(middle.next);
        }

        // Test 4: Empty list (edge case)
        @Test
        public void testEmptyList() {
            // Build list: none (head is null)
            Solution.ListNode list4 = null;

            // Run the method
            Solution.ListNode middle = Solution.middleNode(list4);

            // Verify result → should be null (no nodes in list)
            assertNull(middle);
        }
    }