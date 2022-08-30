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
                    안녕하세요! 제이름은 <b>{this.props.name}</b>입니다.
                </div>
            </>
        );
    }
}

export default MyName;
