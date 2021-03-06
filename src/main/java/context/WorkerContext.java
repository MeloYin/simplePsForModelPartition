package context;

import net.PSRouterClient;
import net.PSWorker;
import store.KVStoreForLevelDB;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: simplePsForModelPartition
 * @description:
 * @author: SongZhen
 * @create: 2018-12-10 18:46
 */
public class WorkerContext {
//    public static PSWorker psWorker;
    public static PSRouterClient psRouterClient;

    public static int workerId;
    /** 判断是分布式执行还是单机执行*/
    public static enum Mode{
        STANDALONE, DISTRIBUTED
    }

    public static Mode mode;

    /** 路径*/
    public static String myDataPath; // 本地训练用到的数据集（划分后）

    /** cat是否在feature前面*/
    public static boolean isCatForwardFeature;

    /** 用于训练的样本个数*/
    public static int sampleListSize;

    /** batch相关信息*/
    public static int sampleBatchListSize; // 训练集包含batch的数目
    public static int sampleBatchSize;  // 一个batch的大小
    public static int inMemSampleBatchNum;  // 内存中可以存下batch的最大数量


    /** 剪枝*/

    public static float pruneRate;
    public static int samplePrunedSize;   // 用于剪枝和模型划分的训练样本个数
    public static int sampleBatchListPrunedSize; // 用于剪枝和模型划分的训练batch个数

    /** 原始数据集相关信息*/
    public static int catSize;

    /** 模型划分相关信息*/
    public static int minPartitionSize;

    /** 磁盘上的k-v数据库*/
    public static KVStoreForLevelDB kvStoreForLevelDB=new KVStoreForLevelDB();
    public static String levelDBPathForWorker;





    public static void init()throws IOException {

        workerId=0;
        mode=Mode.DISTRIBUTED;
        isCatForwardFeature=true;
        sampleListSize=10000;



        samplePrunedSize=10000;

        pruneRate=0.001f;


        myDataPath="data/train"+workerId+".csv";



        catSize=12;

        sampleBatchSize=1000;
        inMemSampleBatchNum=100;

        minPartitionSize=2;

        sampleBatchListSize=sampleListSize/sampleBatchSize;
        sampleBatchListPrunedSize=samplePrunedSize/sampleBatchSize;

        levelDBPathForWorker="data/leveldbForWorker/";
        kvStoreForLevelDB.init(levelDBPathForWorker);


//        psWorker=new PSWorker(Context.serverIp.get(Context.masterId),Context.serverPort.get(Context.masterId));
        psRouterClient=new PSRouterClient();
    }
}
