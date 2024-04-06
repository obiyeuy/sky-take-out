package com.sky.service;

import com.sky.vo.TurnoverReportVO;

import java.time.LocalDate;

/**
 * ClassName:ReportService
 * <p>
 * Package:com.sky.service
 * <p>
 * Description:
 * <p>
 *
 * @Author: yyb
 * @Create: 2024/4/6-14:52
 * @Version: v1.0
 */
public interface ReportService {

    /**
     * 统计指定时间区间内的营业额数据
     * @param begin
     * @param end
     * @return
     */
    TurnoverReportVO getTurnoverStatistics(LocalDate begin, LocalDate end);
}
