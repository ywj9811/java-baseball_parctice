## 기능 목록
1. 1~9 서로 다른 수로 이루어진 3자리의 수를 랜덤으로 생성할 것
2. 숫자를 입력받을 수 있어야 함
3. 위치와 숫자 모두 일치 -> 스트라이크
4. 숫자는 일치하는 것이 있지만 위치가 다르면 -> 볼
5. 아무것도 없다면 -> 낫싱
6. 스트라이크와 볼을 각각 판단할 수 있어야 함
7. 3스트라이크 발생 시 게임 종료
8. 게임 종료 시 그만할지 다시 시작할지 선택할 수 있어야 함
9. 그 외에 기본적인 출력문의 기능을 가져야 함

## 목표
1. 메소드의 길이 10줄 이내로 지킬 것
2. 메소드 하나당 하나의 기능만 가질 수 있도록 할 것
3. 들여쓰기 3 이내로 사용할 것
4. ui로직과 핵심 로직의 분리를 가져갈 것
5. 예외 발생시 `IllegalArgumentException`발생 시키고 처리할 것
6. 메소드의 파라미터는 최대 3개 까지만 받을 것
7. 상수를 활용할 것
8. 가능하다면 Enum을 활용할 것