
# MCMF (Minimum Cost Maximum Flow)

최소 비용 최대 유량 문제 = 최소 비용을 들여서, 최대 유량을 흘린다

플로우를 찾는 과정을 최단 거리 순으로 찾아나가면, 최소비용에 대한 최대 유량을 구할 수 있다

## 정리
정점을 단 한 번만 지나가게 하려면 -> 정점분할을 한 뒤(residual), 정점간의 간선 용량을 1로 설정