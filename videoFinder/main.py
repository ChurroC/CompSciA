import glob
import os
import moviepy.editor as mp
import cv2
from moviepy.video.io.ffmpeg_tools import ffmpeg_extract_subclip

folder_path = 'H:\\CompSciStuff\\videoFinder\\videos\\*.mp4'

if __name__ == "__main__":
    print("Hello World!")
    list_of_files = glob.glob(folder_path)
    if len(list_of_files) == 0:
        print("Could not find files")
        quit()
    latest_file = max(list_of_files, key=os.path.getctime)
    
    clip = mp.VideoFileClip(latest_file)
    print(clip.duration)
    for i in range(int(clip.duration / 60) + 1):
        print(i)
        clip1 = clip.cut(i * 60, (i + 1) * 60)
        clip1.ipython_display(width = 360)
        
    
    