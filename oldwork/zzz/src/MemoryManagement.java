import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// 定义内存块类
class MemoryBlock {
    int startAddress;
    int size;
    boolean allocated;

    public MemoryBlock(int startAddress, int size) {
        this.startAddress = startAddress;
        this.size = size;
        this.allocated = false;
    }
}

public class MemoryManagement {
    static ArrayList<MemoryBlock> memoryBlocks = new ArrayList<>();

    // 初始化内存空间
    public static void initializeMemory(int totalMemorySize) {
        memoryBlocks.clear();
        memoryBlocks.add(new MemoryBlock(0, totalMemorySize));
    }

    // 最优适应算法实现
    public static int allocateMemory(int processSize) {
        // 对内存块按大小升序排序
        Collections.sort(memoryBlocks, Comparator.comparingInt(mb -> mb.size));

        // 寻找最优适应的内存块
        for (MemoryBlock memoryBlock : memoryBlocks) {
            if (!memoryBlock.allocated && memoryBlock.size >= processSize) {
                // 分配内存
                memoryBlock.allocated = true;
                return memoryBlock.startAddress;
            }
        }
        return -1; // 没有合适的内存块可供分配
    }

    // 内存回收
    public static void deallocateMemory(int startAddress) {
        for (MemoryBlock memoryBlock : memoryBlocks) {
            if (memoryBlock.startAddress == startAddress) {
                memoryBlock.allocated = false;
                break;
            }
        }
    }

    // 显示内存分配表
    public static void displayMemoryTable() {
        System.out.println("Memory Allocation Table:");
        for (MemoryBlock memoryBlock : memoryBlocks) {
            System.out.println("Start Address: " + memoryBlock.startAddress +
                    " Size: " + memoryBlock.size +
                    " Allocated: " + (memoryBlock.allocated ? "Yes" : "No"));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 初始化内存空间
        System.out.print("Enter total memory size: ");
    }
}