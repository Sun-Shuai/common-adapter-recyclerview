package com.sunshuai.common_adapter_recyclerview_lib.base;


/**
 * Created by sunshuai on 2018/2/7
 */
public interface ItemViewDelegate<T>
{

    int getItemViewLayoutId();

    boolean isForViewType(T item, int position);

    void convert(ViewHolder holder, T t, int position);

}
