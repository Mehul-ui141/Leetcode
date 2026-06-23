class MedianFinder {
    private $a;
    private $b;
    function __construct() {
        $this->a=new SplMaxHeap();
        $this->b=new SplMinHeap();
    }
  
    /**
     * @param Integer $num
     * @return NULL
     */
    function addNum($num) {
        $this->a->insert($num);
        $this->b->insert($this->a->extract());
        if($this->a->count()<$this->b->count()){
             $this->a->insert($this->b->extract());
        }
    }
  
    /**
     * @return Float
     */
    function findMedian() {
        if($this->a->count()>$this->b->count()){
            return $this->a->top();
        }
        return ($this->a->top() + $this->b->top())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * $obj = MedianFinder();
 * $obj->addNum($num);
 * $ret_2 = $obj->findMedian();
 */