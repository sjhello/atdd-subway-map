package subway.line;

import subway.line.presentation.LineRequest;

public class LineFixture {

    public static LineRequest 신분당선_생성(Long upStationId, Long downStationId) {
        LineRequest lineRequest = new LineRequest(
                "신분당선",
                "red",
                upStationId,
                downStationId,
                10L);

        return lineRequest;
    }

    public static LineRequest 강남2호선_생성(Long upStationId, Long downStationId) {
        LineRequest lineRequest = new LineRequest(
                "강남 2호선",
                "green",
                upStationId,
                downStationId,
                20L);

        return lineRequest;
    }
}