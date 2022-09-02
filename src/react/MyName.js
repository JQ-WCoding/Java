import {Component} from 'react';

class MyName extends Component {
    static defaultProps = {
        name: '기본이름',
    };

    render() {
        return (
            <>
                {/* jsx 내부에서 주석을 작성할 때는 이런 형식으로 주석을 작성함 */}
                <div>
                    안녕하세요! 제이름은 <b>{this.props.name}</b>입니다. {/**/}
                </div>
            </>
            /* 외부에서는 다시 주석을 이런식으로 답니다 */
        );
    }
    // 현재 트랜드 : 간단하게 js 공부하거나 연습하기 위해서 따로 프로젝트를 세팅하지 않고 node.js 를 이용하여 간단하게 바로 연습하는 편
}

export default MyName;
