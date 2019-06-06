
package com.ll.chart.compat.attribute;

import android.content.Context;
import androidx.annotation.NonNull;

/**
 * <p>深度图属性配置类</p>
 */

public class DepthAttribute extends BaseAttribute {

  public DepthAttribute(@NonNull Context context) {
    super(context);
  }

  /**
   * 与深度图有关的属性
   */
  public float polylineWidth = 2.5f; // 折线宽度
  public float circleSize = 12f;// 圆点大小
  public int bidLineColor = 0xff70B76D; // 买单折线颜色
  public int askLineColor = 0xffC45E5C; // 卖单折线颜色
  public int bidShaderColor = 0x1470B76D;// 买单阴影颜色
  public int askShaderColor = 0x14C45E5C;// 卖单阴影颜色
  public int bidHighlightColor = 0x4070B76D;// 买单高亮线颜色
  public int askHighlightColor = 0x40C45E5C;// 卖单高亮线颜色
}